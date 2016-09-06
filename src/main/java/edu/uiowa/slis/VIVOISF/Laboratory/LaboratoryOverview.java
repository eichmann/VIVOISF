package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			if (!theLaboratory.commitNeeded) {
				pageContext.getOut().print(theLaboratory.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			return theLaboratory.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Laboratory for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Laboratory theLaboratory = (Laboratory)findAncestorWithClass(this, Laboratory.class);
			theLaboratory.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for overview tag ");
		}
	}
}

