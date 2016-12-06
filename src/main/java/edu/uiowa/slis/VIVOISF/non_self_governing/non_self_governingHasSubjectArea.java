package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasSubjectAreaIterator thenon_self_governingHasSubjectAreaIterator = (non_self_governingHasSubjectAreaIterator)findAncestorWithClass(this, non_self_governingHasSubjectAreaIterator.class);
			pageContext.getOut().print(thenon_self_governingHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

