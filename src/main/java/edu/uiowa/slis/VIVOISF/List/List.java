package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class List extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static List currentInstance = null;
	private static final Log log = LogFactory.getLog(List.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ListIterator theListIterator = (ListIterator) findAncestorWithClass(this, ListIterator.class);

			if (theListIterator != null) {
				subjectURI = theListIterator.getSubjectURI();
				label = theListIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Class.ClassUnionOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Class.ClassUnionOfIterator)this.getParent()).getUnionOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Class.ClassOneOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Class.ClassOneOfIterator)this.getParent()).getOneOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.List.ListRestIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.List.ListRestIterator)this.getParent()).getRest();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Class.ClassHasKeyIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Class.ClassHasKeyIterator)this.getParent()).getHasKey();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Resource.ResourceMembersIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Resource.ResourceMembersIterator)this.getParent()).getMembers();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AllDifferent.AllDifferentDistinctMembersIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AllDifferent.AllDifferentDistinctMembersIterator)this.getParent()).getDistinctMembers();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Restriction.RestrictionOnPropertiesIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Restriction.RestrictionOnPropertiesIterator)this.getParent()).getOnProperties();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Class.ClassDisjointUnionOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Class.ClassDisjointUnionOfIterator)this.getParent()).getDisjointUnionOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Class.ClassIntersectionOfIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Class.ClassIntersectionOfIterator)this.getParent()).getIntersectionOf();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.ObjectProperty.ObjectPropertyPropertyChainAxiomIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.ObjectProperty.ObjectPropertyPropertyChainAxiomIterator)this.getParent()).getPropertyChainAxiom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.OrderedCollection.OrderedCollectionMemberListIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.OrderedCollection.OrderedCollectionMemberListIterator)this.getParent()).getMemberList();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Datatype.DatatypeWithRestrictionsIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Datatype.DatatypeWithRestrictionsIterator)this.getParent()).getWithRestrictions();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator)this.getParent()).getEditorList();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator)this.getParent()).getAuthorList();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator)this.getParent()).getContributorList();
			}

			edu.uiowa.slis.VIVOISF.Class.ClassUnionOfIterator theClassUnionOfIterator = (edu.uiowa.slis.VIVOISF.Class.ClassUnionOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Class.ClassUnionOfIterator.class);

			if (subjectURI == null && theClassUnionOfIterator != null) {
				subjectURI = theClassUnionOfIterator.getUnionOf();
			}

			edu.uiowa.slis.VIVOISF.Class.ClassOneOfIterator theClassOneOfIterator = (edu.uiowa.slis.VIVOISF.Class.ClassOneOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Class.ClassOneOfIterator.class);

			if (subjectURI == null && theClassOneOfIterator != null) {
				subjectURI = theClassOneOfIterator.getOneOf();
			}

			edu.uiowa.slis.VIVOISF.List.ListRestIterator theListRestIterator = (edu.uiowa.slis.VIVOISF.List.ListRestIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.List.ListRestIterator.class);

			if (subjectURI == null && theListRestIterator != null) {
				subjectURI = theListRestIterator.getRest();
			}

			edu.uiowa.slis.VIVOISF.Class.ClassHasKeyIterator theClassHasKeyIterator = (edu.uiowa.slis.VIVOISF.Class.ClassHasKeyIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Class.ClassHasKeyIterator.class);

			if (subjectURI == null && theClassHasKeyIterator != null) {
				subjectURI = theClassHasKeyIterator.getHasKey();
			}

			edu.uiowa.slis.VIVOISF.Resource.ResourceMembersIterator theResourceMembersIterator = (edu.uiowa.slis.VIVOISF.Resource.ResourceMembersIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Resource.ResourceMembersIterator.class);

			if (subjectURI == null && theResourceMembersIterator != null) {
				subjectURI = theResourceMembersIterator.getMembers();
			}

			edu.uiowa.slis.VIVOISF.AllDifferent.AllDifferentDistinctMembersIterator theAllDifferentDistinctMembersIterator = (edu.uiowa.slis.VIVOISF.AllDifferent.AllDifferentDistinctMembersIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AllDifferent.AllDifferentDistinctMembersIterator.class);

			if (subjectURI == null && theAllDifferentDistinctMembersIterator != null) {
				subjectURI = theAllDifferentDistinctMembersIterator.getDistinctMembers();
			}

			edu.uiowa.slis.VIVOISF.Restriction.RestrictionOnPropertiesIterator theRestrictionOnPropertiesIterator = (edu.uiowa.slis.VIVOISF.Restriction.RestrictionOnPropertiesIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Restriction.RestrictionOnPropertiesIterator.class);

			if (subjectURI == null && theRestrictionOnPropertiesIterator != null) {
				subjectURI = theRestrictionOnPropertiesIterator.getOnProperties();
			}

			edu.uiowa.slis.VIVOISF.Class.ClassDisjointUnionOfIterator theClassDisjointUnionOfIterator = (edu.uiowa.slis.VIVOISF.Class.ClassDisjointUnionOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Class.ClassDisjointUnionOfIterator.class);

			if (subjectURI == null && theClassDisjointUnionOfIterator != null) {
				subjectURI = theClassDisjointUnionOfIterator.getDisjointUnionOf();
			}

			edu.uiowa.slis.VIVOISF.Class.ClassIntersectionOfIterator theClassIntersectionOfIterator = (edu.uiowa.slis.VIVOISF.Class.ClassIntersectionOfIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Class.ClassIntersectionOfIterator.class);

			if (subjectURI == null && theClassIntersectionOfIterator != null) {
				subjectURI = theClassIntersectionOfIterator.getIntersectionOf();
			}

			edu.uiowa.slis.VIVOISF.ObjectProperty.ObjectPropertyPropertyChainAxiomIterator theObjectPropertyPropertyChainAxiomIterator = (edu.uiowa.slis.VIVOISF.ObjectProperty.ObjectPropertyPropertyChainAxiomIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.ObjectProperty.ObjectPropertyPropertyChainAxiomIterator.class);

			if (subjectURI == null && theObjectPropertyPropertyChainAxiomIterator != null) {
				subjectURI = theObjectPropertyPropertyChainAxiomIterator.getPropertyChainAxiom();
			}

			edu.uiowa.slis.VIVOISF.OrderedCollection.OrderedCollectionMemberListIterator theOrderedCollectionMemberListIterator = (edu.uiowa.slis.VIVOISF.OrderedCollection.OrderedCollectionMemberListIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.OrderedCollection.OrderedCollectionMemberListIterator.class);

			if (subjectURI == null && theOrderedCollectionMemberListIterator != null) {
				subjectURI = theOrderedCollectionMemberListIterator.getMemberList();
			}

			edu.uiowa.slis.VIVOISF.Datatype.DatatypeWithRestrictionsIterator theDatatypeWithRestrictionsIterator = (edu.uiowa.slis.VIVOISF.Datatype.DatatypeWithRestrictionsIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Datatype.DatatypeWithRestrictionsIterator.class);

			if (subjectURI == null && theDatatypeWithRestrictionsIterator != null) {
				subjectURI = theDatatypeWithRestrictionsIterator.getWithRestrictions();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator theDocumentEditorListIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentEditorListIterator.class);

			if (subjectURI == null && theDocumentEditorListIterator != null) {
				subjectURI = theDocumentEditorListIterator.getEditorList();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator theDocumentAuthorListIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentAuthorListIterator.class);

			if (subjectURI == null && theDocumentAuthorListIterator != null) {
				subjectURI = theDocumentAuthorListIterator.getAuthorList();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator theDocumentContributorListIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentContributorListIterator.class);

			if (subjectURI == null && theDocumentContributorListIterator != null) {
				subjectURI = theDocumentContributorListIterator.getContributorList();
			}

			if (theListIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in List doStartTag", e);
			throw new JspTagException("Exception raised in List doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in List doEndTag", e);
			throw new JspTagException("Exception raised in List doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
