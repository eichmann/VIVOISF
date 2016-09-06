package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			if (!theEmeritusLibrarian.commitNeeded) {
				pageContext.getOut().print(theEmeritusLibrarian.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			return theEmeritusLibrarian.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusLibrarian for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			theEmeritusLibrarian.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for outreachOverview tag ");
		}
	}
}

