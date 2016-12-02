package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class territory extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territory currentInstance = null;
	private static final Log log = LogFactory.getLog(territory.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			territoryIterator theterritoryIterator = (territoryIterator) findAncestorWithClass(this, territoryIterator.class);

			if (theterritoryIterator != null) {
				subjectURI = theterritoryIterator.getSubjectURI();
				label = theterritoryIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.group.groupHasMemberIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.group.groupHasMemberIterator)this.getParent()).getHasMember();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.territory.territoryHasBorderWithIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.territory.territoryHasBorderWithIterator)this.getParent()).getHasBorderWith();
			}

			edu.uiowa.slis.VIVOISF.group.groupHasMemberIterator thegroupHasMemberIterator = (edu.uiowa.slis.VIVOISF.group.groupHasMemberIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.group.groupHasMemberIterator.class);

			if (subjectURI == null && thegroupHasMemberIterator != null) {
				subjectURI = thegroupHasMemberIterator.getHasMember();
			}

			edu.uiowa.slis.VIVOISF.territory.territoryHasBorderWithIterator theterritoryHasBorderWithIterator = (edu.uiowa.slis.VIVOISF.territory.territoryHasBorderWithIterator) findAncestorWithClass(this, edu.uiowa.slis.VIVOISF.territory.territoryHasBorderWithIterator.class);

			if (subjectURI == null && theterritoryHasBorderWithIterator != null) {
				subjectURI = theterritoryHasBorderWithIterator.getHasBorderWith();
			}

			if (theterritoryIterator == null && subjectURI == null) {
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
			log.error("Exception raised in territory doStartTag", e);
			throw new JspTagException("Exception raised in territory doStartTag");
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
			log.error("Exception raised in territory doEndTag", e);
			throw new JspTagException("Exception raised in territory doEndTag");
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
