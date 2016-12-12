package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Editorship extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Editorship currentInstance = null;
	private static final Log log = LogFactory.getLog(Editorship.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			EditorshipIterator theEditorshipIterator = (EditorshipIterator) findAncestorWithClass(this, EditorshipIterator.class);

			if (theEditorshipIterator != null) {
				subjectURI = theEditorshipIterator.getSubjectURI();
				label = theEditorshipIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator)this.getParent()).getRelatedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator)this.getParent()).getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator theBFO_0000001RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000001.BFO_0000001RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000001RelatedByIterator != null) {
				subjectURI = theBFO_0000001RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator theBFO_0000002RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000002.BFO_0000002RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000002RelatedByIterator != null) {
				subjectURI = theBFO_0000002RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator theThingRelatedByIterator = (edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Thing.ThingRelatedByIterator.class);

			if (subjectURI == null && theThingRelatedByIterator != null) {
				subjectURI = theThingRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator theBFO_0000031RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000031.BFO_0000031RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000031RelatedByIterator != null) {
				subjectURI = theBFO_0000031RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator theIAO_0000030RelatedByIterator = (edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.IAO_0000030.IAO_0000030RelatedByIterator.class);

			if (subjectURI == null && theIAO_0000030RelatedByIterator != null) {
				subjectURI = theIAO_0000030RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator theDocumentRelatedByIterator = (edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Document.DocumentRelatedByIterator.class);

			if (subjectURI == null && theDocumentRelatedByIterator != null) {
				subjectURI = theDocumentRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator theArticleRelatedByIterator = (edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Article.ArticleRelatedByIterator.class);

			if (subjectURI == null && theArticleRelatedByIterator != null) {
				subjectURI = theArticleRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator theAcademicArticleRelatedByIterator = (edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.AcademicArticle.AcademicArticleRelatedByIterator.class);

			if (subjectURI == null && theAcademicArticleRelatedByIterator != null) {
				subjectURI = theAcademicArticleRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator theBFO_0000004RelatedByIterator = (edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.BFO_0000004.BFO_0000004RelatedByIterator.class);

			if (subjectURI == null && theBFO_0000004RelatedByIterator != null) {
				subjectURI = theBFO_0000004RelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator theAgentRelatedByIterator = (edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Agent.AgentRelatedByIterator.class);

			if (subjectURI == null && theAgentRelatedByIterator != null) {
				subjectURI = theAgentRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator thePersonRelatedByIterator = (edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Person.PersonRelatedByIterator.class);

			if (subjectURI == null && thePersonRelatedByIterator != null) {
				subjectURI = thePersonRelatedByIterator.getRelatedBy();
			}

			edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator theBookRelatedByIterator = (edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.Book.BookRelatedByIterator.class);

			if (subjectURI == null && theBookRelatedByIterator != null) {
				subjectURI = theBookRelatedByIterator.getRelatedBy();
			}

			if (theEditorshipIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Editorship doStartTag", e);
			throw new JspTagException("Exception raised in Editorship doStartTag");
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
			log.error("Exception raised in Editorship doEndTag", e);
			throw new JspTagException("Exception raised in Editorship doEndTag");
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
