package de.protos.ontolizer.generator;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import de.protos.ontolizer.ontolizer.DepthRange;
import de.protos.ontolizer.ontolizer.Edge;
import de.protos.ontolizer.ontolizer.EdgeList;
import de.protos.ontolizer.ontolizer.EdgeType;
import de.protos.ontolizer.ontolizer.Model;
import de.protos.ontolizer.ontolizer.Node;
import de.protos.ontolizer.ontolizer.NodeType;
import de.protos.ontolizer.ontolizer.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.annotations.Delegate;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DotGenerator extends AbstractGenerator {
  @Accessors
  public static class ExpandedModel implements Model {
    @Delegate
    private final Model model;
    
    private final Multimap<Node, Edge> forwardEdges;
    
    private final Multimap<Node, Edge> backwardEdges;
    
    public ExpandedModel(final Model model) {
      this.model = model;
      TreeIterator<EObject> _eAllContents = model.eAllContents();
      Iterator<Edge> _filter = Iterators.<Edge>filter(_eAllContents, Edge.class);
      final Function<Edge, Node> _function = (Edge it) -> {
        EObject _eContainer = it.eContainer();
        EObject _eContainer_1 = _eContainer.eContainer();
        return ((Node) _eContainer_1);
      };
      ImmutableListMultimap<Node, Edge> _index = Multimaps.<Node, Edge>index(_filter, _function);
      this.forwardEdges = _index;
      TreeIterator<EObject> _eAllContents_1 = model.eAllContents();
      Iterator<EdgeList> _filter_1 = Iterators.<EdgeList>filter(_eAllContents_1, EdgeList.class);
      final Function1<EdgeList, EList<Edge>> _function_1 = (EdgeList it) -> {
        return it.getEdges();
      };
      Iterator<EList<Edge>> _map = IteratorExtensions.<EdgeList, EList<Edge>>map(_filter_1, _function_1);
      Iterable<EList<Edge>> _iterable = IteratorExtensions.<EList<Edge>>toIterable(_map);
      Iterable<Edge> _flatten = Iterables.<Edge>concat(_iterable);
      final Function<Edge, Node> _function_2 = (Edge it) -> {
        return it.getTargetNode();
      };
      ImmutableListMultimap<Node, Edge> _index_1 = Multimaps.<Node, Edge>index(_flatten, _function_2);
      this.backwardEdges = _index_1;
    }
    
    @Pure
    public Model getModel() {
      return this.model;
    }
    
    @Pure
    public Multimap<Node, Edge> getForwardEdges() {
      return this.forwardEdges;
    }
    
    @Pure
    public Multimap<Node, Edge> getBackwardEdges() {
      return this.backwardEdges;
    }
    
    public EList<EdgeType> getEdgeTypes() {
      return this.model.getEdgeTypes();
    }
    
    public EList<NodeType> getNodeTypes() {
      return this.model.getNodeTypes();
    }
    
    public EList<Node> getNodes() {
      return this.model.getNodes();
    }
    
    public EList<View> getViews() {
      return this.model.getViews();
    }
    
    public TreeIterator<EObject> eAllContents() {
      return this.model.eAllContents();
    }
    
    public EClass eClass() {
      return this.model.eClass();
    }
    
    public EObject eContainer() {
      return this.model.eContainer();
    }
    
    public EStructuralFeature eContainingFeature() {
      return this.model.eContainingFeature();
    }
    
    public EReference eContainmentFeature() {
      return this.model.eContainmentFeature();
    }
    
    public EList<EObject> eContents() {
      return this.model.eContents();
    }
    
    public EList<EObject> eCrossReferences() {
      return this.model.eCrossReferences();
    }
    
    public Object eGet(final EStructuralFeature feature) {
      return this.model.eGet(feature);
    }
    
    public Object eGet(final EStructuralFeature feature, final boolean resolve) {
      return this.model.eGet(feature, resolve);
    }
    
    public Object eInvoke(final EOperation operation, final EList<?> arguments) throws InvocationTargetException {
      return this.model.eInvoke(operation, arguments);
    }
    
    public boolean eIsProxy() {
      return this.model.eIsProxy();
    }
    
    public boolean eIsSet(final EStructuralFeature feature) {
      return this.model.eIsSet(feature);
    }
    
    public Resource eResource() {
      return this.model.eResource();
    }
    
    public void eSet(final EStructuralFeature feature, final Object newValue) {
      this.model.eSet(feature, newValue);
    }
    
    public void eUnset(final EStructuralFeature feature) {
      this.model.eUnset(feature);
    }
    
    public EList<Adapter> eAdapters() {
      return this.model.eAdapters();
    }
    
    public boolean eDeliver() {
      return this.model.eDeliver();
    }
    
    public void eNotify(final Notification notification) {
      this.model.eNotify(notification);
    }
    
    public void eSetDeliver(final boolean deliver) {
      this.model.eSetDeliver(deliver);
    }
  }
  
  private final static String NEWLINE = System.lineSeparator();
  
  /**
   * Default value in emf model.
   */
  private final static int DEPTH_DEFAULT_VALUE = 0;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final ArrayList<String> baseFileNames = CollectionLiterals.<String>newArrayList();
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final DotGenerator.ExpandedModel model = new DotGenerator.ExpandedModel(((Model) _head));
    EList<View> _views = model.getViews();
    final Function1<View, List<String>> _function = (View it) -> {
      return this.generateView(model, it, fsa);
    };
    List<List<String>> _map = ListExtensions.<View, List<String>>map(_views, _function);
    Iterable<String> _flatten = Iterables.<String>concat(_map);
    Iterables.<String>addAll(baseFileNames, _flatten);
    this.generateAntBuildfile(baseFileNames, fsa);
  }
  
  public static <T extends Object> void bfs(final Iterable<T> iterable, final Function2<? super T, ? super Integer, Iterable<? extends T>> visitFunction) {
    final HashSet<T> visted = CollectionLiterals.<T>newHashSet();
    final LinkedList<T> stack = CollectionLiterals.<T>newLinkedList(((T[])Conversions.unwrapArray(iterable, Object.class)));
    int currentDepth = 0;
    T _xifexpression = null;
    boolean _isEmpty = stack.isEmpty();
    boolean _not = (!_isEmpty);
    if (_not) {
      _xifexpression = stack.getLast();
    }
    T lastElementInDepth = _xifexpression;
    while ((!stack.isEmpty())) {
      {
        final T current = stack.pop();
        Iterable<? extends T> _apply = visitFunction.apply(current, Integer.valueOf(currentDepth));
        final Consumer<T> _function = (T toVisit) -> {
          boolean _add = visted.add(toVisit);
          if (_add) {
            stack.addLast(toVisit);
          }
        };
        _apply.forEach(_function);
        boolean _equals = Objects.equal(current, lastElementInDepth);
        if (_equals) {
          T _xifexpression_1 = null;
          boolean _isEmpty_1 = stack.isEmpty();
          boolean _not_1 = (!_isEmpty_1);
          if (_not_1) {
            _xifexpression_1 = stack.getLast();
          }
          lastElementInDepth = _xifexpression_1;
          int _currentDepth = currentDepth;
          currentDepth = (_currentDepth + 1);
        }
      }
    }
  }
  
  public List<String> generateView(final DotGenerator.ExpandedModel model, final View view, final IFileSystemAccess2 fsa) {
    final List<String> baseFileNames = CollectionLiterals.<String>newArrayList();
    final Function1<Node, Boolean> _function = (Node node) -> {
      boolean _or = false;
      EList<NodeType> _nodeTypes = view.getNodeTypes();
      boolean _isEmpty = _nodeTypes.isEmpty();
      if (_isEmpty) {
        _or = true;
      } else {
        EList<NodeType> _nodeTypes_1 = view.getNodeTypes();
        NodeType _nodeType = node.getNodeType();
        boolean _contains = _nodeTypes_1.contains(_nodeType);
        _or = _contains;
      }
      return Boolean.valueOf(_or);
    };
    final Function1<? super Node, ? extends Boolean> nodeFilter = _function;
    final Function1<Edge, Boolean> _function_1 = (Edge edge) -> {
      boolean _or = false;
      EList<EdgeType> _edgeTypes = view.getEdgeTypes();
      boolean _isEmpty = _edgeTypes.isEmpty();
      if (_isEmpty) {
        _or = true;
      } else {
        EList<EdgeType> _edgeTypes_1 = view.getEdgeTypes();
        EObject _eContainer = edge.eContainer();
        boolean _contains = _edgeTypes_1.contains(_eContainer);
        _or = _contains;
      }
      return Boolean.valueOf(_or);
    };
    final Function1<? super Edge, ? extends Boolean> edgeFilter = _function_1;
    EList<Node> _nodes = model.getNodes();
    final Function1<Node, Boolean> _function_2 = (Node it) -> {
      return nodeFilter.apply(it);
    };
    final Iterable<Node> contextNodes = IterableExtensions.<Node>filter(_nodes, _function_2);
    boolean _or = false;
    DepthRange _depth = view.getDepth();
    boolean _equals = Objects.equal(_depth, null);
    if (_equals) {
      _or = true;
    } else {
      DepthRange _depth_1 = view.getDepth();
      int _start = _depth_1.getStart();
      boolean _equals_1 = (_start == 0);
      _or = _equals_1;
    }
    if (_or) {
      int _xifexpression = (int) 0;
      DepthRange _depth_2 = view.getDepth();
      boolean _equals_2 = Objects.equal(_depth_2, null);
      if (_equals_2) {
        _xifexpression = 1;
      } else {
        DepthRange _depth_3 = view.getDepth();
        _xifexpression = _depth_3.getStart();
      }
      final int graphDepth = _xifexpression;
      final ArrayList<Node> graphNodes = CollectionLiterals.<Node>newArrayList();
      final ArrayList<Edge> graphEdges = CollectionLiterals.<Edge>newArrayList();
      final Function2<Node, Integer, Iterable<? extends Node>> _function_3 = (Node node, Integer depth) -> {
        graphNodes.add(node);
        if (((depth).intValue() >= graphDepth)) {
          return CollectionLiterals.<Node>emptyList();
        }
        Collection<Edge> _get = model.forwardEdges.get(node);
        final Function1<Edge, Boolean> _function_4 = (Edge it) -> {
          return edgeFilter.apply(it);
        };
        final Iterable<Edge> forwardEdges = IterableExtensions.<Edge>filter(_get, _function_4);
        Collection<Edge> _get_1 = model.backwardEdges.get(node);
        final Function1<Edge, Boolean> _function_5 = (Edge it) -> {
          return edgeFilter.apply(it);
        };
        final Iterable<Edge> backwardEdges = IterableExtensions.<Edge>filter(_get_1, _function_5);
        Iterable<Edge> _plus = Iterables.<Edge>concat(forwardEdges, backwardEdges);
        Set<Edge> _set = IterableExtensions.<Edge>toSet(_plus);
        Iterables.<Edge>addAll(graphEdges, _set);
        final Function1<Edge, Node> _function_6 = (Edge it) -> {
          return it.getTargetNode();
        };
        Iterable<Node> _map = IterableExtensions.<Edge, Node>map(forwardEdges, _function_6);
        final Function1<Edge, Node> _function_7 = (Edge it) -> {
          EObject _eContainer = it.eContainer();
          EObject _eContainer_1 = _eContainer.eContainer();
          return ((Node) _eContainer_1);
        };
        Iterable<Node> _map_1 = IterableExtensions.<Edge, Node>map(backwardEdges, _function_7);
        Iterable<Node> _plus_1 = Iterables.<Node>concat(_map, _map_1);
        final Function1<Node, Boolean> _function_8 = (Node it) -> {
          return nodeFilter.apply(it);
        };
        return IterableExtensions.<Node>filter(_plus_1, _function_8);
      };
      DotGenerator.<Node>bfs(contextNodes, _function_3);
      StringConcatenation _builder = new StringConcatenation();
      String _name = view.getName();
      _builder.append(_name, "");
      _builder.append(".dot");
      CharSequence _generateDotFile = this.generateDotFile(graphNodes, graphEdges, null);
      fsa.generateFile(_builder.toString(), _generateDotFile);
      String _name_1 = view.getName();
      baseFileNames.add(_name_1);
    } else {
      final Consumer<Node> _function_4 = (Node contextNode) -> {
        int _xifexpression_1 = (int) 0;
        DepthRange _depth_4 = view.getDepth();
        int _end = _depth_4.getEnd();
        boolean _equals_3 = (_end == DotGenerator.DEPTH_DEFAULT_VALUE);
        if (_equals_3) {
          DepthRange _depth_5 = view.getDepth();
          _xifexpression_1 = _depth_5.getStart();
        } else {
          DepthRange _depth_6 = view.getDepth();
          _xifexpression_1 = _depth_6.getEnd();
        }
        final int depthEnd = _xifexpression_1;
        final Function1<Integer, String> _function_5 = (Integer graphDepth_1) -> {
          StringConcatenation _builder_1 = new StringConcatenation();
          String _name_2 = view.getName();
          _builder_1.append(_name_2, "");
          _builder_1.append("_");
          _builder_1.append(graphDepth_1, "");
          _builder_1.append("_");
          return _builder_1.toString();
        };
        final Function1<? super Integer, ? extends String> filePrefixComputer = _function_5;
        final LinkedHashMap<Integer, String> depthToc = CollectionLiterals.<Integer, String>newLinkedHashMap();
        DepthRange _depth_7 = view.getDepth();
        int _start_1 = _depth_7.getStart();
        IntegerRange _upTo = new IntegerRange(_start_1, depthEnd);
        for (final Integer graphDepth_1 : _upTo) {
          String _apply = filePrefixComputer.apply(graphDepth_1);
          String _name_2 = contextNode.getName();
          String _plus = (_apply + _name_2);
          String _plus_1 = (_plus + ".html");
          depthToc.put(graphDepth_1, _plus_1);
        }
        int lastEdgeCount = 0;
        DepthRange _depth_8 = view.getDepth();
        int _start_2 = _depth_8.getStart();
        IntegerRange _upTo_1 = new IntegerRange(_start_2, depthEnd);
        for (final Integer graphDepth_2 : _upTo_1) {
          {
            final ArrayList<Node> graphNodes_1 = CollectionLiterals.<Node>newArrayList();
            final ArrayList<Edge> graphEdges_1 = CollectionLiterals.<Edge>newArrayList();
            final Function2<Node, Integer, Iterable<? extends Node>> _function_6 = (Node node, Integer depth) -> {
              graphNodes_1.add(node);
              boolean _greaterEqualsThan = (depth.compareTo(graphDepth_2) >= 0);
              if (_greaterEqualsThan) {
                return CollectionLiterals.<Node>emptyList();
              }
              Collection<Edge> _get = model.forwardEdges.get(node);
              final Function1<Edge, Boolean> _function_7 = (Edge it) -> {
                return edgeFilter.apply(it);
              };
              final Iterable<Edge> forwardEdges = IterableExtensions.<Edge>filter(_get, _function_7);
              Collection<Edge> _get_1 = model.backwardEdges.get(node);
              final Function1<Edge, Boolean> _function_8 = (Edge it) -> {
                return edgeFilter.apply(it);
              };
              final Iterable<Edge> backwardEdges = IterableExtensions.<Edge>filter(_get_1, _function_8);
              Iterable<Edge> _plus_2 = Iterables.<Edge>concat(forwardEdges, backwardEdges);
              Set<Edge> _set = IterableExtensions.<Edge>toSet(_plus_2);
              Iterables.<Edge>addAll(graphEdges_1, _set);
              final Function1<Edge, Node> _function_9 = (Edge it) -> {
                return it.getTargetNode();
              };
              Iterable<Node> _map = IterableExtensions.<Edge, Node>map(forwardEdges, _function_9);
              final Function1<Edge, Node> _function_10 = (Edge it) -> {
                EObject _eContainer = it.eContainer();
                EObject _eContainer_1 = _eContainer.eContainer();
                return ((Node) _eContainer_1);
              };
              Iterable<Node> _map_1 = IterableExtensions.<Edge, Node>map(backwardEdges, _function_10);
              Iterable<Node> _plus_3 = Iterables.<Node>concat(_map, _map_1);
              final Function1<Node, Boolean> _function_11 = (Node it) -> {
                return nodeFilter.apply(it);
              };
              return IterableExtensions.<Node>filter(_plus_3, _function_11);
            };
            DotGenerator.<Node>bfs(Collections.<Node>unmodifiableList(CollectionLiterals.<Node>newArrayList(contextNode)), _function_6);
            final String filePrefix = filePrefixComputer.apply(graphDepth_2);
            final Function1<Node, String> _function_7 = (Node node) -> {
              String _name_3 = node.getName();
              String _plus_2 = (filePrefix + _name_3);
              return (_plus_2 + ".svg");
            };
            final Function1<? super Node, ? extends String> urlComputer = _function_7;
            String _name_3 = contextNode.getName();
            String _plus_2 = (filePrefix + _name_3);
            String _plus_3 = (_plus_2 + ".dot");
            CharSequence _generateDotFile_1 = this.generateDotFile(graphNodes_1, graphEdges_1, urlComputer);
            fsa.generateFile(_plus_3, _generateDotFile_1);
            String _name_4 = contextNode.getName();
            String _plus_4 = (filePrefix + _name_4);
            String _plus_5 = (_plus_4 + ".html");
            String _apply_1 = urlComputer.apply(contextNode);
            CharSequence _generateGraphHTML = this.generateGraphHTML(_apply_1, depthToc);
            fsa.generateFile(_plus_5, _generateGraphHTML);
            String _name_5 = contextNode.getName();
            String _plus_6 = (filePrefix + _name_5);
            baseFileNames.add(_plus_6);
            int _size = graphEdges_1.size();
            boolean _greaterEqualsThan = (lastEdgeCount >= _size);
            if (_greaterEqualsThan) {
              return;
            }
            int _size_1 = graphEdges_1.size();
            lastEdgeCount = _size_1;
          }
        }
      };
      contextNodes.forEach(_function_4);
    }
    return baseFileNames;
  }
  
  public CharSequence generateDotFile(final Iterable<Node> nodes, final Iterable<Edge> edges, final Function1<? super Node, ? extends String> urlComputer) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<CharSequence> dotEntries = CollectionLiterals.<CharSequence>newArrayList();
      final Function1<Node, CharSequence> _function = (Node it) -> {
        String _apply = null;
        if (urlComputer!=null) {
          _apply=urlComputer.apply(it);
        }
        return this.genDot(it, _apply);
      };
      Iterable<CharSequence> _map = IterableExtensions.<Node, CharSequence>map(nodes, _function);
      Iterables.<CharSequence>addAll(dotEntries, _map);
      final Function1<Edge, CharSequence> _function_1 = (Edge it) -> {
        return this.genDot(it);
      };
      Iterable<CharSequence> _map_1 = IterableExtensions.<Edge, CharSequence>map(edges, _function_1);
      Iterables.<CharSequence>addAll(dotEntries, _map_1);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("digraph {");
      _builder.newLine();
      _builder.append("\t");
      String _join = IterableExtensions.join(dotEntries, DotGenerator.NEWLINE);
      _builder.append(_join, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence genDot(final Node it, final String url) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<String> entries = CollectionLiterals.<String>newArrayList();
      String _dotFormatAttributes = this.getDotFormatAttributes(it);
      entries.add(_dotFormatAttributes);
      EList<String> _summary = it.getSummary();
      boolean _isNullOrEmpty = IterableExtensions.isNullOrEmpty(_summary);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("label=\"");
        String _name = it.getName();
        _builder.append(_name, "");
        _builder.append("\\n");
        EList<String> _summary_1 = it.getSummary();
        _builder.append(_summary_1, "");
        _builder.append("\"");
        entries.add(_builder.toString());
      }
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(url);
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("URL=\"");
        _builder_1.append(url, "");
        _builder_1.append("\"");
        entries.add(_builder_1.toString());
      }
      StringConcatenation _builder_2 = new StringConcatenation();
      String _name_1 = it.getName();
      _builder_2.append(_name_1, "");
      _builder_2.append(" [");
      String _join = IterableExtensions.join(entries, ", ");
      _builder_2.append(_join, "");
      _builder_2.append("];");
      _xblockexpression = _builder_2;
    }
    return _xblockexpression;
  }
  
  public CharSequence genDot(final Edge it) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<String> entries = CollectionLiterals.<String>newArrayList();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("label = \"");
      EObject _eContainer = it.eContainer();
      EdgeType _edgeType = ((EdgeList) _eContainer).getEdgeType();
      String _name = _edgeType.getName();
      _builder.append(_name, "");
      _builder.append("\"");
      entries.add(_builder.toString());
      StringConcatenation _builder_1 = new StringConcatenation();
      EObject _eContainer_1 = it.eContainer();
      EObject _eContainer_2 = _eContainer_1.eContainer();
      String _name_1 = ((Node) _eContainer_2).getName();
      _builder_1.append(_name_1, "");
      _builder_1.append(" -> ");
      Node _targetNode = it.getTargetNode();
      String _name_2 = _targetNode.getName();
      _builder_1.append(_name_2, "");
      _builder_1.append(" [ ");
      String _join = IterableExtensions.join(entries, ", ");
      _builder_1.append(_join, "");
      _builder_1.append(" ];");
      _xblockexpression = _builder_1;
    }
    return _xblockexpression;
  }
  
  public String getDotFormatAttributes(final Node node) {
    String _xblockexpression = null;
    {
      final ArrayList<String> formatList = CollectionLiterals.<String>newArrayList();
      NodeType _nodeType = node.getNodeType();
      String _shape = _nodeType.getShape();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_shape);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        NodeType _nodeType_1 = node.getNodeType();
        String _shape_1 = _nodeType_1.getShape();
        String _plus = ("shape=" + _shape_1);
        formatList.add(_plus);
      }
      NodeType _nodeType_2 = node.getNodeType();
      String _color = _nodeType_2.getColor();
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_color);
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        NodeType _nodeType_3 = node.getNodeType();
        String _color_1 = _nodeType_3.getColor();
        String _plus_1 = ("fillcolor=" + _color_1);
        formatList.add(_plus_1);
      }
      NodeType _nodeType_4 = node.getNodeType();
      String _style = _nodeType_4.getStyle();
      boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_style);
      boolean _not_2 = (!_isNullOrEmpty_2);
      if (_not_2) {
        NodeType _nodeType_5 = node.getNodeType();
        String _style_1 = _nodeType_5.getStyle();
        String _plus_2 = ("style=" + _style_1);
        formatList.add(_plus_2);
      }
      final Function1<String, Boolean> _function = (String s) -> {
        boolean _isEmpty = s.isEmpty();
        return Boolean.valueOf((!_isEmpty));
      };
      Iterable<String> _filter = IterableExtensions.<String>filter(formatList, _function);
      _xblockexpression = IterableExtensions.join(_filter, ",");
    }
    return _xblockexpression;
  }
  
  private void generateAntBuildfile(final List<String> baseFileNames, final IFileSystemAccess2 fsa) {
    CharSequence _generateDotBuildfileContent = this.generateDotBuildfileContent(baseFileNames);
    fsa.generateFile("build.xml", _generateDotBuildfileContent);
  }
  
  private CharSequence generateDotBuildfileContent(final List<String> baseFileNames) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<!-- ====================================================================== ");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("Generates bitmap images from DOT files for process documentation");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("====================================================================== -->");
    _builder.newLine();
    _builder.append("<project name=\"builddotfiles\" default=\"build\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<description>");
    _builder.newLine();
    _builder.append("\t   \t");
    _builder.append("Generates bitmap images from DOT files for process documentation");
    _builder.newLine();
    _builder.append("\t   ");
    _builder.append("</description>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<target name=\"build\" description=\"description\" depends=\"init-dot.binpath\">");
    _builder.newLine();
    {
      for(final String fileName : baseFileNames) {
        _builder.append("\t\t");
        _builder.append("<compileDot mapFile=\"");
        _builder.append(fileName, "\t\t");
        _builder.append(".map\" svgFile=\"");
        _builder.append(fileName, "\t\t");
        _builder.append(".svg\" dotFile=\"");
        _builder.append(fileName, "\t\t");
        _builder.append(".dot\"/>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</target>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<macrodef name=\"compileDot\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<attribute name=\"mapFile\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<attribute name=\"svgFile\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<attribute name=\"dotFile\"/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<sequential>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<exec executable=\"${dot.binpath}\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<arg value=\"-Tsvg\"/>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<arg value=\"-o@{svgFile}\" />");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<arg value=\"@{dotFile}\" />");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</exec>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</sequential>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</macrodef>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<target name=\"init-dot.binpath\" unless=\"dot.binpath\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<property environment=\"env\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<condition property=\"dot.binpath\" value=\"${env.DOT_PATH}/dot\" else=\"dot\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<isset property=\"env.DOT_PATH\" />");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</condition>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</target>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</project>");
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateGraphHTML(final String svgFilePath, final Map<Integer, String> depthFilePaths) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script src=\"http://code.jquery.com/jquery-3.0.0.min.js\"></script>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script>");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("$(function(){");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("$(\"#includedContent\").load(\"");
    _builder.append(svgFilePath, "\t      ");
    _builder.append("\", function() {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t      ");
    _builder.append("var aList = document.getElementsByTagName(\"a\");");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("for(var i=0;i<aList.length;i++){");
    _builder.newLine();
    _builder.append("\t\t    \t  ");
    _builder.append("var origLink = aList[i].getAttributeNS(\'http://www.w3.org/1999/xlink\', \'href\');");
    _builder.newLine();
    _builder.append("\t\t    \t  ");
    _builder.append("if(origLink != null){");
    _builder.newLine();
    _builder.append("\t\t    \t  \t");
    _builder.append("aList[i].setAttributeNS(\'http://www.w3.org/1999/xlink\', \'href\', origLink.replace(\'.svg\', \'.html\'));");
    _builder.newLine();
    _builder.append("\t\t    \t  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t      ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t      ");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t    ");
    _builder.append("});");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</script>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"depthLinks\">");
    {
      Set<Map.Entry<Integer, String>> _entrySet = depthFilePaths.entrySet();
      boolean _hasElements = false;
      for(final Map.Entry<Integer, String> entry : _entrySet) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("Depths: ", "\t");
        } else {
          _builder.appendImmediate(", ", "\t");
        }
        _builder.append("<a href=\"");
        String _value = entry.getValue();
        _builder.append(_value, "\t");
        _builder.append("\">");
        Integer _key = entry.getKey();
        _builder.append(_key, "\t");
        _builder.append("</a>");
      }
    }
    _builder.append("</div>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<div id=\"includedContent\"></div>");
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
