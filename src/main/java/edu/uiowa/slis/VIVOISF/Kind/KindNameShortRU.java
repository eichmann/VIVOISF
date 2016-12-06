package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameShortRUIterator theKind = (KindNameShortRUIterator)findAncestorWithClass(this, KindNameShortRUIterator.class);
			pageContext.getOut().print(theKind.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

