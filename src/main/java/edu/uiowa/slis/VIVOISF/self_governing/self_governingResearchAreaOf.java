package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingResearchAreaOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingResearchAreaOf currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingResearchAreaOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingResearchAreaOfIterator theself_governingResearchAreaOfIterator = (self_governingResearchAreaOfIterator)findAncestorWithClass(this, self_governingResearchAreaOfIterator.class);
			pageContext.getOut().print(theself_governingResearchAreaOfIterator.getResearchAreaOf());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

