package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameListRUIterator theKind = (KindNameListRUIterator)findAncestorWithClass(this, KindNameListRUIterator.class);
			pageContext.getOut().print(theKind.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

