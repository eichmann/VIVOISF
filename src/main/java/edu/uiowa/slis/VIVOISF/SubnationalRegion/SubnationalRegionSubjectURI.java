package edu.uiowa.slis.VIVOISF.SubnationalRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SubnationalRegionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SubnationalRegionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SubnationalRegionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SubnationalRegion theSubnationalRegion = (SubnationalRegion)findAncestorWithClass(this, SubnationalRegion.class);
			if (!theSubnationalRegion.commitNeeded) {
				pageContext.getOut().print(theSubnationalRegion.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SubnationalRegion for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			SubnationalRegion theSubnationalRegion = (SubnationalRegion)findAncestorWithClass(this, SubnationalRegion.class);
			return theSubnationalRegion.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing SubnationalRegion for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			SubnationalRegion theSubnationalRegion = (SubnationalRegion)findAncestorWithClass(this, SubnationalRegion.class);
			theSubnationalRegion.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing SubnationalRegion for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SubnationalRegion for subjectURI tag ");
		}
	}
}

