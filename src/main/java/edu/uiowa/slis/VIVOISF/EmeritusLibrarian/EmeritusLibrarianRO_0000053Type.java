package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianRO_0000053Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianRO_0000053Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianRO_0000053Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianRO_0000053Iterator theEmeritusLibrarianRO_0000053Iterator = (EmeritusLibrarianRO_0000053Iterator)findAncestorWithClass(this, EmeritusLibrarianRO_0000053Iterator.class);
			pageContext.getOut().print(theEmeritusLibrarianRO_0000053Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for RO_0000053 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for RO_0000053 tag ");
		}
		return SKIP_BODY;
	}
}

