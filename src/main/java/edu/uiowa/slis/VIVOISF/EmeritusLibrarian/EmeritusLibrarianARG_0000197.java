package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianARG_0000197 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianARG_0000197 currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianARG_0000197.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarianARG_0000197Iterator theEmeritusLibrarian = (EmeritusLibrarianARG_0000197Iterator)findAncestorWithClass(this, EmeritusLibrarianARG_0000197Iterator.class);
			pageContext.getOut().print(theEmeritusLibrarian.getARG_0000197());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for ARG_0000197 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for ARG_0000197 tag ");
		}
		return SKIP_BODY;
	}
}

