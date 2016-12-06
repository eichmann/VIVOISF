package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(KindNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindNameOfficialRUIterator theKind = (KindNameOfficialRUIterator)findAncestorWithClass(this, KindNameOfficialRUIterator.class);
			pageContext.getOut().print(theKind.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

