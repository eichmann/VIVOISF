package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			if (!theEmeritusLibrarian.commitNeeded) {
				pageContext.getOut().print(theEmeritusLibrarian.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			return theEmeritusLibrarian.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusLibrarian for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			theEmeritusLibrarian.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for overview tag ");
		}
	}
}

