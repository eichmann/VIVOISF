package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			KindHasSubjectAreaIterator theKindHasSubjectAreaIterator = (KindHasSubjectAreaIterator)findAncestorWithClass(this, KindHasSubjectAreaIterator.class);
			pageContext.getOut().print(theKindHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

