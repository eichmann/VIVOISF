package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianRO_0000056Iterator theEmeritusLibrarianRO_0000056Iterator = (EmeritusLibrarianRO_0000056Iterator)findAncestorWithClass(this, EmeritusLibrarianRO_0000056Iterator.class);
			pageContext.getOut().print(theEmeritusLibrarianRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

