package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasSubjectArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasSubjectArea currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasSubjectArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasSubjectAreaIterator theKindHasSubjectAreaIterator = (KindHasSubjectAreaIterator)findAncestorWithClass(this, KindHasSubjectAreaIterator.class);
			pageContext.getOut().print(theKindHasSubjectAreaIterator.getHasSubjectArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

