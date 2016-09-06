package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			if (!theCoreLaboratory.commitNeeded) {
				pageContext.getOut().print(theCoreLaboratory.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			return theCoreLaboratory.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing CoreLaboratory for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			CoreLaboratory theCoreLaboratory = (CoreLaboratory)findAncestorWithClass(this, CoreLaboratory.class);
			theCoreLaboratory.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for overview tag ");
		}
	}
}

