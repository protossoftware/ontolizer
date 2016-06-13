package de.protos.ontolizer.generator;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.collect.ArrayListMultimap;
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
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class DotGenerator extends AbstractGenerator {
  public static class GenerationResults {
    private final ArrayList<String> dotBaseFileNames = CollectionLiterals.<String>newArrayList();
    
    private final LinkedHashMap<View, String> globalViewLinks = CollectionLiterals.<View, String>newLinkedHashMap();
    
    private final LinkedHashMap<View, Multimap<Node, Pair<Integer, String>>> depthViewLinks = CollectionLiterals.<View, Multimap<Node, Pair<Integer, String>>>newLinkedHashMap();
  }
  
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
  
  /**
   * Default value in emf model.
   */
  private final static int DEPTH_DEFAULT_VALUE = 0;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final DotGenerator.GenerationResults results = new DotGenerator.GenerationResults();
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final DotGenerator.ExpandedModel model = new DotGenerator.ExpandedModel(((Model) _head));
    EList<View> _views = model.getViews();
    final Consumer<View> _function = (View it) -> {
      this.generateView(model, it, fsa, results);
    };
    _views.forEach(_function);
    CharSequence _generateDotBuildfileContent = this.generateDotBuildfileContent(results.dotBaseFileNames);
    fsa.generateFile("build.xml", _generateDotBuildfileContent);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("!");
    URI _uRI = resource.getURI();
    String _lastSegment = _uRI.lastSegment();
    _builder.append(_lastSegment, "");
    _builder.append(".html");
    CharSequence _generateTocFileContents = this.generateTocFileContents(results.globalViewLinks, results.depthViewLinks);
    fsa.generateFile(_builder.toString(), _generateTocFileContents);
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
  
  public void generateView(final DotGenerator.ExpandedModel model, final View view, final IFileSystemAccess2 fsa, final DotGenerator.GenerationResults results) {
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
        EdgeType _edgeType = ((EdgeList) _eContainer).getEdgeType();
        boolean _contains = _edgeTypes_1.contains(_edgeType);
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
      final HashSet<Edge> graphEdges = CollectionLiterals.<Edge>newHashSet();
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
      final Function1<Node, Iterable<String>> _function_4 = (Node node) -> {
        return this.getDotFormatAttributes(node, false);
      };
      CharSequence _generateDotFile = this.generateDotFile(graphNodes, graphEdges, _function_4);
      fsa.generateFile(_builder.toString(), _generateDotFile);
      String _name_1 = view.getName();
      results.dotBaseFileNames.add(_name_1);
      String _name_2 = view.getName();
      String _plus = (_name_2 + ".svg");
      results.globalViewLinks.put(view, _plus);
    } else {
      ArrayListMultimap<Node, Pair<Integer, String>> _create = ArrayListMultimap.<Node, Pair<Integer, String>>create();
      results.depthViewLinks.put(view, _create);
      final Consumer<Node> _function_5 = (Node contextNode) -> {
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
        final Function1<Integer, String> _function_6 = (Integer graphDepth_1) -> {
          StringConcatenation _builder_1 = new StringConcatenation();
          String _name_3 = view.getName();
          _builder_1.append(_name_3, "");
          _builder_1.append("_");
          _builder_1.append(graphDepth_1, "");
          _builder_1.append("_");
          return _builder_1.toString();
        };
        final Function1<? super Integer, ? extends String> filePrefixComputer = _function_6;
        final LinkedHashMap<Integer, String> depthToc = CollectionLiterals.<Integer, String>newLinkedHashMap();
        DepthRange _depth_7 = view.getDepth();
        int _start_1 = _depth_7.getStart();
        IntegerRange _upTo = new IntegerRange(_start_1, depthEnd);
        for (final Integer graphDepth_1 : _upTo) {
          String _apply = filePrefixComputer.apply(graphDepth_1);
          String _name_3 = contextNode.getName();
          String _plus_1 = (_apply + _name_3);
          String _plus_2 = (_plus_1 + ".html");
          depthToc.put(graphDepth_1, _plus_2);
        }
        DepthRange _depth_8 = view.getDepth();
        int _start_2 = _depth_8.getStart();
        IntegerRange _upTo_1 = new IntegerRange(_start_2, depthEnd);
        for (final Integer graphDepth_2 : _upTo_1) {
          {
            final ArrayList<Node> graphNodes_1 = CollectionLiterals.<Node>newArrayList();
            final HashSet<Edge> graphEdges_1 = CollectionLiterals.<Edge>newHashSet();
            final Function2<Node, Integer, Iterable<? extends Node>> _function_7 = (Node node, Integer depth) -> {
              graphNodes_1.add(node);
              boolean _greaterEqualsThan = (depth.compareTo(graphDepth_2) >= 0);
              if (_greaterEqualsThan) {
                return CollectionLiterals.<Node>emptyList();
              }
              Collection<Edge> _get = model.forwardEdges.get(node);
              final Function1<Edge, Boolean> _function_8 = (Edge it) -> {
                return edgeFilter.apply(it);
              };
              final Iterable<Edge> forwardEdges = IterableExtensions.<Edge>filter(_get, _function_8);
              Collection<Edge> _get_1 = model.backwardEdges.get(node);
              final Function1<Edge, Boolean> _function_9 = (Edge it) -> {
                return edgeFilter.apply(it);
              };
              final Iterable<Edge> backwardEdges = IterableExtensions.<Edge>filter(_get_1, _function_9);
              Iterable<Edge> _plus_3 = Iterables.<Edge>concat(forwardEdges, backwardEdges);
              Set<Edge> _set = IterableExtensions.<Edge>toSet(_plus_3);
              Iterables.<Edge>addAll(graphEdges_1, _set);
              final Function1<Edge, Node> _function_10 = (Edge it) -> {
                return it.getTargetNode();
              };
              Iterable<Node> _map = IterableExtensions.<Edge, Node>map(forwardEdges, _function_10);
              final Function1<Edge, Node> _function_11 = (Edge it) -> {
                EObject _eContainer = it.eContainer();
                EObject _eContainer_1 = _eContainer.eContainer();
                return ((Node) _eContainer_1);
              };
              Iterable<Node> _map_1 = IterableExtensions.<Edge, Node>map(backwardEdges, _function_11);
              Iterable<Node> _plus_4 = Iterables.<Node>concat(_map, _map_1);
              final Function1<Node, Boolean> _function_12 = (Node it) -> {
                return nodeFilter.apply(it);
              };
              return IterableExtensions.<Node>filter(_plus_4, _function_12);
            };
            DotGenerator.<Node>bfs(Collections.<Node>unmodifiableList(CollectionLiterals.<Node>newArrayList(contextNode)), _function_7);
            final String filePrefix = filePrefixComputer.apply(graphDepth_2);
            String _name_4 = contextNode.getName();
            final String contextNodeBaseFileName = (filePrefix + _name_4);
            final Function1<Node, Iterable<String>> _function_8 = (Node node) -> {
              boolean _equals_4 = Objects.equal(node, contextNode);
              Iterable<String> _dotFormatAttributes = this.getDotFormatAttributes(node, _equals_4);
              String _name_5 = node.getName();
              String _plus_3 = (("URL=\"" + filePrefix) + _name_5);
              String _plus_4 = (_plus_3 + ".svg\"");
              return Iterables.<String>concat(_dotFormatAttributes, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_plus_4)));
            };
            final Function1<? super Node, ? extends Iterable<String>> propComputer = _function_8;
            CharSequence _generateDotFile_1 = this.generateDotFile(graphNodes_1, graphEdges_1, propComputer);
            fsa.generateFile((contextNodeBaseFileName + ".dot"), _generateDotFile_1);
            CharSequence _generateGraphHTML = this.generateGraphHTML((contextNodeBaseFileName + ".svg"), depthToc);
            fsa.generateFile((contextNodeBaseFileName + ".html"), _generateGraphHTML);
            results.dotBaseFileNames.add(contextNodeBaseFileName);
            Multimap<Node, Pair<Integer, String>> _get = results.depthViewLinks.get(view);
            Pair<Integer, String> _mappedTo = Pair.<Integer, String>of(graphDepth_2, (contextNodeBaseFileName + ".html"));
            _get.put(contextNode, _mappedTo);
          }
        }
      };
      contextNodes.forEach(_function_5);
    }
  }
  
  public CharSequence generateDotFile(final Iterable<Node> nodes, final Iterable<Edge> edges, final Function1<? super Node, ? extends Iterable<String>> propComputer) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("digraph {");
    _builder.newLine();
    {
      for(final Node node : nodes) {
        _builder.append("\t");
        String _name = node.getName();
        _builder.append(_name, "\t");
        _builder.append(" [");
        Iterable<String> _apply = propComputer.apply(node);
        String _join = IterableExtensions.join(_apply, ", ");
        _builder.append(_join, "\t");
        _builder.append("];");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      for(final Edge edge : edges) {
        _builder.append("\t");
        CharSequence _genDot = this.genDot(edge);
        _builder.append(_genDot, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
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
  
  public Iterable<String> getDotFormatAttributes(final Node it, final boolean highlight) {
    final ArrayList<String> formatList = CollectionLiterals.<String>newArrayList();
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
      formatList.add(_builder.toString());
    }
    NodeType _nodeType = it.getNodeType();
    String _shape = _nodeType.getShape();
    boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_shape);
    boolean _not_1 = (!_isNullOrEmpty_1);
    if (_not_1) {
      NodeType _nodeType_1 = it.getNodeType();
      String _shape_1 = _nodeType_1.getShape();
      String _plus = ("shape=" + _shape_1);
      formatList.add(_plus);
    }
    if (highlight) {
      formatList.add("fillcolor=red");
    } else {
      NodeType _nodeType_2 = it.getNodeType();
      String _color = _nodeType_2.getColor();
      boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_color);
      boolean _not_2 = (!_isNullOrEmpty_2);
      if (_not_2) {
        NodeType _nodeType_3 = it.getNodeType();
        String _color_1 = _nodeType_3.getColor();
        String _plus_1 = ("fillcolor=" + _color_1);
        formatList.add(_plus_1);
      }
    }
    NodeType _nodeType_4 = it.getNodeType();
    String _style = _nodeType_4.getStyle();
    boolean _isNullOrEmpty_3 = StringExtensions.isNullOrEmpty(_style);
    boolean _not_3 = (!_isNullOrEmpty_3);
    if (_not_3) {
      NodeType _nodeType_5 = it.getNodeType();
      String _style_1 = _nodeType_5.getStyle();
      String _plus_2 = ("style=" + _style_1);
      formatList.add(_plus_2);
    }
    final Function1<String, Boolean> _function = (String s) -> {
      boolean _isEmpty = s.isEmpty();
      return Boolean.valueOf((!_isEmpty));
    };
    return IterableExtensions.<String>filter(formatList, _function);
  }
  
  private CharSequence generateTocFileContents(final Map<View, String> globalViewLinks, final Map<View, Multimap<Node, Pair<Integer, String>>> depthViewLinks) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- stylesheet -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">-->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link href=\"../lib/bootstrap.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<style> a:visited{color:#666633 !important;}</style>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<h2>Views</h2>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<ul>");
    _builder.newLine();
    {
      Set<Map.Entry<View, String>> _entrySet = globalViewLinks.entrySet();
      for(final Map.Entry<View, String> viewEntry : _entrySet) {
        _builder.append("\t");
        _builder.append("<li><a href=\"");
        String _value = viewEntry.getValue();
        _builder.append(_value, "\t");
        _builder.append("\">");
        View _key = viewEntry.getKey();
        String _name = _key.getName();
        _builder.append(_name, "\t");
        _builder.append("</a></li>");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Set<Map.Entry<View, Multimap<Node, Pair<Integer, String>>>> _entrySet_1 = depthViewLinks.entrySet();
      for(final Map.Entry<View, Multimap<Node, Pair<Integer, String>>> viewEntry_1 : _entrySet_1) {
        _builder.append("\t");
        _builder.append("<li>");
        View _key_1 = viewEntry_1.getKey();
        String _name_1 = _key_1.getName();
        _builder.append(_name_1, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("<ul>");
        _builder.newLine();
        {
          Multimap<Node, Pair<Integer, String>> _value_1 = viewEntry_1.getValue();
          Set<Node> _keySet = _value_1.keySet();
          for(final Node contextNode : _keySet) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<li>");
            String _name_2 = contextNode.getName();
            _builder.append(_name_2, "\t\t");
            _builder.append(": ");
            {
              Multimap<Node, Pair<Integer, String>> _value_2 = viewEntry_1.getValue();
              Collection<Pair<Integer, String>> _get = _value_2.get(contextNode);
              boolean _hasElements = false;
              for(final Pair<Integer, String> depthLink : _get) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(", ", "\t\t");
                }
                _builder.append("<a href=\"");
                String _value_3 = depthLink.getValue();
                _builder.append(_value_3, "\t\t");
                _builder.append("\">");
                Integer _key_2 = depthLink.getKey();
                _builder.append(_key_2, "\t\t");
                _builder.append("</a>");
              }
            }
            _builder.append("</li>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("</ul>");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("</li>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
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
    _builder.append("    ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- stylesheet -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!--<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" integrity=\"sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7\" crossorigin=\"anonymous\">-->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<link href=\"../lib/bootstrap.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<style> a:visited{color:#666633 !important;}</style>");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!-- javascript -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!--<script src=\"http://code.jquery.com/jquery-3.0.0.min.js\"></script>-->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<script src=\"../lib/jquery-3.0.0.min.js\"></script>");
    _builder.newLine();
    _builder.append("\t");
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
