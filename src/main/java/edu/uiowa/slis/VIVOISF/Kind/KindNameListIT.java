package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameListITIterator theKind = (KindNameListITIterator)findAncestorWithClass(this, KindNameListITIterator.class);
			pageContext.getOut().print(theKind.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

