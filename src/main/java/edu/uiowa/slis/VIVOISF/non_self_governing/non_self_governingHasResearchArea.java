package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasResearchAreaIterator thenon_self_governingHasResearchAreaIterator = (non_self_governingHasResearchAreaIterator)findAncestorWithClass(this, non_self_governingHasResearchAreaIterator.class);
			pageContext.getOut().print(thenon_self_governingHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

