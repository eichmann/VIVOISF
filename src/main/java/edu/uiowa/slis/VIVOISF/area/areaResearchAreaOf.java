package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(areaResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			areaResearchAreaOfIterator theareaResearchAreaOfIterator = (areaResearchAreaOfIterator)findAncestorWithClass(this, areaResearchAreaOfIterator.class);
			pageContext.getOut().print(theareaResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing area for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

