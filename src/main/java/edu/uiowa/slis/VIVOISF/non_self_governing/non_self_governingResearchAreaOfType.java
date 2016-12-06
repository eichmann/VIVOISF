package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingResearchAreaOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingResearchAreaOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingResearchAreaOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingResearchAreaOfIterator thenon_self_governingResearchAreaOfIterator = (non_self_governingResearchAreaOfIterator)findAncestorWithClass(this, non_self_governingResearchAreaOfIterator.class);
			pageContext.getOut().print(thenon_self_governingResearchAreaOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for researchAreaOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for researchAreaOf tag ");
		}
		return SKIP_BODY;
	}
}

