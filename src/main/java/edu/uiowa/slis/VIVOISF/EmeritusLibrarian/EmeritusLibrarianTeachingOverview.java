package edu.uiowa.slis.VIVOISF.EmeritusLibrarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusLibrarianTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusLibrarianTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusLibrarianTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			if (!theEmeritusLibrarian.commitNeeded) {
				pageContext.getOut().print(theEmeritusLibrarian.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			return theEmeritusLibrarian.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing EmeritusLibrarian for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			EmeritusLibrarian theEmeritusLibrarian = (EmeritusLibrarian)findAncestorWithClass(this, EmeritusLibrarian.class);
			theEmeritusLibrarian.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusLibrarian for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusLibrarian for teachingOverview tag ");
		}
	}
}

