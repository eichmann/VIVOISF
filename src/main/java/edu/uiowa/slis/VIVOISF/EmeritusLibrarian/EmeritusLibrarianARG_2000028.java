package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianARG_2000028Iterator theEmeritusLibrarianARG_2000028Iterator = (EmeritusLibrarianARG_2000028Iterator)findAncestorWithClass(this, EmeritusLibrarianARG_2000028Iterator.class);
			pageContext.getOut().print(theEmeritusLibrarianARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

