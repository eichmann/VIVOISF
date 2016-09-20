package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianERO_0000037Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianERO_0000037Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianERO_0000037Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianERO_0000037Iterator theEmeritusLibrarianERO_0000037Iterator = (EmeritusLibrarianERO_0000037Iterator)findAncestorWithClass(this, EmeritusLibrarianERO_0000037Iterator.class);
			pageContext.getOut().print(theEmeritusLibrarianERO_0000037Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for ERO_0000037 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for ERO_0000037 tag ");
		}
		return SKIP_BODY;
	}
}

