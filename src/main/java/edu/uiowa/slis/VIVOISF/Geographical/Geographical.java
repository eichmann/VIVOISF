package edu.uiowa.slis.VIVOISF.Geographical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Geographical extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Geographical currentInstance = null;
	private static final Log log = LogFactory.getLog(Geographical.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited


	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GeographicalIterator theGeographicalIterator = (GeographicalIterator) findAncestorWithClass(this, GeographicalIterator.class);

			if (theGeographicalIterator != null) {
				subjectURI = theGeographicalIterator.getSubjectURI();
				label = theGeographicalIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Address.AddressHasAddressInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Address.AddressHasAddressInverseIterator)this.getParent()).getHasAddressInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Geo.GeoHasGeoInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Geo.GeoHasGeoInverseIterator)this.getParent()).getHasGeoInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.Email.EmailHasEmailInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.Email.EmailHasEmailInverseIterator)this.getParent()).getHasEmailInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.VIVOISF.URL.URLHasURLInverseIterator) {
				subjectURI = ((edu.uiowa.slis.VIVOISF.URL.URLHasURLInverseIterator)this.getParent()).getHasURLInverse();
			}

			if (theGeographicalIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label  where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Geographical doStartTag", e);
			throw new JspTagException("Exception raised in Geographical doStartTag");
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
			log.error("Exception raised in Geographical doEndTag", e);
			throw new JspTagException("Exception raised in Geographical doEndTag");
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
