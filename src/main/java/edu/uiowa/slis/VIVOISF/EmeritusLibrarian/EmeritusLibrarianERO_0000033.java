package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianERO_0000033 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianERO_0000033 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianERO_0000033.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianERO_0000033Iterator theEmeritusLibrarianERO_0000033Iterator = (EmeritusLibrarianERO_0000033Iterator)findAncestorWithClass(this, EmeritusLibrarianERO_0000033Iterator.class);
			pageContext.getOut().print(theEmeritusLibrarianERO_0000033Iterator.getERO_0000033());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for ERO_0000033 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for ERO_0000033 tag ");
		}
		return SKIP_BODY;
	}
}

