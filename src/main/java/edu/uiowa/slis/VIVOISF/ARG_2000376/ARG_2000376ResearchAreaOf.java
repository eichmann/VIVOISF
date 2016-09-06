package edu.uiowa.slis.VIVOISF.ARG_2000376;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000376ResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000376ResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000376ResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ARG_2000376ResearchAreaOfIterator theARG_2000376ResearchAreaOfIterator = (ARG_2000376ResearchAreaOfIterator)findAncestorWithClass(this, ARG_2000376ResearchAreaOfIterator.class);
			pageContext.getOut().print(theARG_2000376ResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000376 for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000376 for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

