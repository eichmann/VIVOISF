package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			if (!theEmeritusLibrarian.commitNeeded) {
				pageContext.getOut().print(theEmeritusLibrarian.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			return theEmeritusLibrarian.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusLibrarian for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			theEmeritusLibrarian.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for researchOverview tag ");
		}
	}
}

