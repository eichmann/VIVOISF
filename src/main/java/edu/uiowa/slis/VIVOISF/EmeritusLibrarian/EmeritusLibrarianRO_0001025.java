package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianRO_0001025Iterator theEmeritusLibrarianRO_0001025Iterator = (EmeritusLibrarianRO_0001025Iterator)findAncestorWithClass(this, EmeritusLibrarianRO_0001025Iterator.class);
			pageContext.getOut().print(theEmeritusLibrarianRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

