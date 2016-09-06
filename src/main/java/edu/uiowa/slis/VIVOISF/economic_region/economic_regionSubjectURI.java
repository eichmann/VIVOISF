package edu.uiowa.slis.VIVOISF.economic_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class economic_regionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static economic_regionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(economic_regionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			if (!theeconomic_region.commitNeeded) {
				pageContext.getOut().print(theeconomic_region.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			return theeconomic_region.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing economic_region for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			economic_region theeconomic_region = (economic_region)findAncestorWithClass(this, economic_region.class);
			theeconomic_region.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing economic_region for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing economic_region for subjectURI tag ");
		}
	}
}

