package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Brief theBrief = (Brief)findAncestorWithClass(this, Brief.class);
			if (!theBrief.commitNeeded) {
				pageContext.getOut().print(theBrief.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Brief theBrief = (Brief)findAncestorWithClass(this, Brief.class);
			return theBrief.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Brief for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Brief theBrief = (Brief)findAncestorWithClass(this, Brief.class);
			theBrief.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for label tag ");
		}
	}
}

