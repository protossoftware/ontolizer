package de.protos.ontolizer.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import de.protos.ontolizer.ontolizer.Edge;
import de.protos.ontolizer.ontolizer.EdgeList;
import de.protos.ontolizer.ontolizer.EdgeType;
import de.protos.ontolizer.ontolizer.Model;
import de.protos.ontolizer.ontolizer.Node;
import de.protos.ontolizer.ontolizer.NodeType;
import de.protos.ontolizer.ontolizer.View;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
import org.eclipse.xtext.xbase.lib.Functions.Function1;
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
    
    private final Map<Node, Edge> forwardEdges = IteratorExtensions.<Node, Edge>toMap(Iterators.<Edge>filter(this.model.eAllContents(), Edge.class), ((Function1<Edge, Node>) (Edge it) -> {
      EObject _eContainer = it.eContainer();
      EObject _eContainer_1 = _eContainer.eContainer();
      return ((Node) _eContainer_1);
    }));
    
    private final Map<Node, Edge> backwardEdges = IterableExtensions.<Node, Edge>toMap(Iterables.<Edge>concat(IteratorExtensions.<EList<Edge>>toIterable(IteratorExtensions.<EdgeList, EList<Edge>>map(Iterators.<EdgeList>filter(this.model.eAllContents(), EdgeList.class), ((Function1<EdgeList, EList<Edge>>) (EdgeList it) -> {
      return it.getEdges();
    })))), ((Function1<Edge, Node>) (Edge it) -> {
      return it.getTargetNode();
    }));
    
    public ExpandedModel(final Model model) {
      super();
      this.model = model;
    }
    
    @Pure
    public Model getModel() {
      return this.model;
    }
    
    @Pure
    public Map<Node, Edge> getForwardEdges() {
      return this.forwardEdges;
    }
    
    @Pure
    public Map<Node, Edge> getBackwardEdges() {
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
  
  private final static int MAX_DEPTH = 0;
  
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
  
  public List<String> generateView(final DotGenerator.ExpandedModel model, final View view, final IFileSystemAccess2 fsa) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Edge to Iterable<?>"
      + "\nType mismatch: cannot convert from Edge to Iterable<?>");
  }
  
  public CharSequence generateDotFile(final HashSet<Node> nodes, final HashSet<Edge> edges, final Function1<? super Node, ? extends String> urlComputer) {
    CharSequence _xblockexpression = null;
    {
      final ArrayList<CharSequence> dotEntries = CollectionLiterals.<CharSequence>newArrayList();
      final Function1<Node, CharSequence> _function = (Node it) -> {
        String _apply = urlComputer.apply(it);
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
  
  public Iterable<Node> filterNodesForNodeTypes(final EList<Node> nodes, final EList<NodeType> nodeTypes) {
    Iterable<Node> _xifexpression = null;
    boolean _isEmpty = nodeTypes.isEmpty();
    if (_isEmpty) {
      _xifexpression = nodes;
    } else {
      final Function1<Node, Boolean> _function = (Node e) -> {
        NodeType _nodeType = e.getNodeType();
        return Boolean.valueOf(nodeTypes.contains(_nodeType));
      };
      _xifexpression = IterableExtensions.<Node>filter(nodes, _function);
    }
    return _xifexpression;
  }
  
  public Iterable<EdgeList> filterEdgeListsForEdgeTypes(final Iterable<EdgeList> edgeLists, final EList<EdgeType> edgeTypes) {
    Iterable<EdgeList> _xifexpression = null;
    boolean _isEmpty = edgeTypes.isEmpty();
    if (_isEmpty) {
      _xifexpression = edgeLists;
    } else {
      final Function1<EdgeList, Boolean> _function = (EdgeList e) -> {
        EdgeType _edgeType = e.getEdgeType();
        return Boolean.valueOf(edgeTypes.contains(_edgeType));
      };
      _xifexpression = IterableExtensions.<EdgeList>filter(edgeLists, _function);
    }
    return _xifexpression;
  }
  
  public Iterable<Edge> filterEdgesForNodeTypes(final Iterable<Edge> edges, final EList<NodeType> nodeTypes) {
    Iterable<Edge> _xifexpression = null;
    boolean _isEmpty = nodeTypes.isEmpty();
    if (_isEmpty) {
      _xifexpression = edges;
    } else {
      final Function1<Edge, Boolean> _function = (Edge e) -> {
        Node _targetNode = e.getTargetNode();
        NodeType _nodeType = _targetNode.getNodeType();
        return Boolean.valueOf(nodeTypes.contains(_nodeType));
      };
      _xifexpression = IterableExtensions.<Edge>filter(edges, _function);
    }
    return _xifexpression;
  }
}
