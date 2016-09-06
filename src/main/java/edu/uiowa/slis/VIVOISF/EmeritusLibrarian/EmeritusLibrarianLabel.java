package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			if (!theEmeritusLibrarian.commitNeeded) {
				pageContext.getOut().print(theEmeritusLibrarian.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			return theEmeritusLibrarian.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusLibrarian for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			theEmeritusLibrarian.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for label tag ");
		}
	}
}

