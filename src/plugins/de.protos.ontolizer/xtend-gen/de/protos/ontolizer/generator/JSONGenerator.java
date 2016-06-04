package de.protos.ontolizer.generator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Iterables;
import de.protos.ontolizer.ontolizer.Edge;
import de.protos.ontolizer.ontolizer.EdgeList;
import de.protos.ontolizer.ontolizer.EdgeType;
import de.protos.ontolizer.ontolizer.Model;
import de.protos.ontolizer.ontolizer.Node;
import de.protos.ontolizer.ontolizer.NodeType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class JSONGenerator extends AbstractGenerator {
  @Accessors
  private static class JNode {
    private int id;
    
    private String name;
    
    private String summary;
    
    private String type;
    
    private final List<JSONGenerator.JEdgeList> edgeList = CollectionLiterals.<JSONGenerator.JEdgeList>newArrayList();
    
    @Pure
    public int getId() {
      return this.id;
    }
    
    public void setId(final int id) {
      this.id = id;
    }
    
    @Pure
    public String getName() {
      return this.name;
    }
    
    public void setName(final String name) {
      this.name = name;
    }
    
    @Pure
    public String getSummary() {
      return this.summary;
    }
    
    public void setSummary(final String summary) {
      this.summary = summary;
    }
    
    @Pure
    public String getType() {
      return this.type;
    }
    
    public void setType(final String type) {
      this.type = type;
    }
    
    @Pure
    public List<JSONGenerator.JEdgeList> getEdgeList() {
      return this.edgeList;
    }
  }
  
  @Accessors
  private static class JEdgeList {
    private String type;
    
    private final List<Integer> edges = CollectionLiterals.<Integer>newArrayList();
    
    @Pure
    public String getType() {
      return this.type;
    }
    
    public void setType(final String type) {
      this.type = type;
    }
    
    @Pure
    public List<Integer> getEdges() {
      return this.edges;
    }
  }
  
  private static class GenContext {
    private int lastId = 0;
    
    public int popId() {
      return this.lastId++;
    }
  }
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      EList<EObject> _contents = input.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      final Model model = ((Model) _head);
      final List<JSONGenerator.JNode> nodes = this.generate(model);
      final ObjectMapper mapper = new ObjectMapper();
      URI _uRI = input.getURI();
      String _lastSegment = _uRI.lastSegment();
      URI _uRI_1 = input.getURI();
      String _fileExtension = _uRI_1.fileExtension();
      String _plus = ("." + _fileExtension);
      String _replace = _lastSegment.replace(_plus, "");
      final String fileName = (_replace + ".js");
      String _writeValueAsString = mapper.writeValueAsString(nodes);
      String _plus_1 = ("jsonData = \'" + _writeValueAsString);
      String _plus_2 = (_plus_1 + "\';");
      fsa.generateFile(fileName, _plus_2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public List<JSONGenerator.JNode> generate(final Model model) {
    ArrayList<JSONGenerator.JNode> _xblockexpression = null;
    {
      final JSONGenerator.GenContext genContext = new JSONGenerator.GenContext();
      ArrayList<JSONGenerator.JNode> _newArrayList = CollectionLiterals.<JSONGenerator.JNode>newArrayList();
      final Procedure1<ArrayList<JSONGenerator.JNode>> _function = (ArrayList<JSONGenerator.JNode> it) -> {
        EList<Node> _nodes = model.getNodes();
        final Function1<Node, JSONGenerator.JNode> _function_1 = (Node it_1) -> {
          return this.createNode(it_1, genContext);
        };
        List<JSONGenerator.JNode> _map = ListExtensions.<Node, JSONGenerator.JNode>map(_nodes, _function_1);
        Iterables.<JSONGenerator.JNode>addAll(it, _map);
        final Function1<JSONGenerator.JNode, Integer> _function_2 = (JSONGenerator.JNode it_1) -> {
          return Integer.valueOf(it_1.id);
        };
        ListExtensions.<JSONGenerator.JNode, Integer>sortInplaceBy(it, _function_2);
      };
      _xblockexpression = ObjectExtensions.<ArrayList<JSONGenerator.JNode>>operator_doubleArrow(_newArrayList, _function);
    }
    return _xblockexpression;
  }
  
  public JSONGenerator.JNode createNode(final Node node, final JSONGenerator.GenContext context) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(node, context);
    final JSONGenerator.JNode _result;
    synchronized (_createCache_createNode) {
      if (_createCache_createNode.containsKey(_cacheKey)) {
        return _createCache_createNode.get(_cacheKey);
      }
      JSONGenerator.JNode _jNode = new JSONGenerator.JNode();
      _result = _jNode;
      _createCache_createNode.put(_cacheKey, _result);
    }
    _init_createNode(_result, node, context);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, JSONGenerator.JNode> _createCache_createNode = CollectionLiterals.newHashMap();
  
  private void _init_createNode(final JSONGenerator.JNode it, final Node node, final JSONGenerator.GenContext context) {
    int _popId = context.popId();
    it.id = _popId;
    String _name = node.getName();
    it.name = _name;
    NodeType _nodeType = node.getNodeType();
    String _name_1 = _nodeType.getName();
    it.type = _name_1;
    EList<EdgeList> _edgeLists = node.getEdgeLists();
    final Function1<EdgeList, JSONGenerator.JEdgeList> _function = (EdgeList it_1) -> {
      return this.createEdgeList(it_1, context);
    };
    List<JSONGenerator.JEdgeList> _map = ListExtensions.<EdgeList, JSONGenerator.JEdgeList>map(_edgeLists, _function);
    Iterables.<JSONGenerator.JEdgeList>addAll(it.edgeList, _map);
  }
  
  public JSONGenerator.JEdgeList createEdgeList(final EdgeList edgeList, final JSONGenerator.GenContext context) {
    final ArrayList<?> _cacheKey = CollectionLiterals.newArrayList(edgeList, context);
    final JSONGenerator.JEdgeList _result;
    synchronized (_createCache_createEdgeList) {
      if (_createCache_createEdgeList.containsKey(_cacheKey)) {
        return _createCache_createEdgeList.get(_cacheKey);
      }
      JSONGenerator.JEdgeList _jEdgeList = new JSONGenerator.JEdgeList();
      _result = _jEdgeList;
      _createCache_createEdgeList.put(_cacheKey, _result);
    }
    _init_createEdgeList(_result, edgeList, context);
    return _result;
  }
  
  private final HashMap<ArrayList<?>, JSONGenerator.JEdgeList> _createCache_createEdgeList = CollectionLiterals.newHashMap();
  
  private void _init_createEdgeList(final JSONGenerator.JEdgeList it, final EdgeList edgeList, final JSONGenerator.GenContext context) {
    EdgeType _edgeType = edgeList.getEdgeType();
    String _name = _edgeType.getName();
    it.type = _name;
    EList<Edge> _edges = edgeList.getEdges();
    final Function1<Edge, Integer> _function = (Edge it_1) -> {
      Node _targetNode = it_1.getTargetNode();
      JSONGenerator.JNode _createNode = this.createNode(_targetNode, context);
      return Integer.valueOf(_createNode.id);
    };
    List<Integer> _map = ListExtensions.<Edge, Integer>map(_edges, _function);
    Iterables.<Integer>addAll(it.edges, _map);
  }
}
