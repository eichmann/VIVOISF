package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			if (!theCenter.commitNeeded) {
				pageContext.getOut().print(theCenter.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Center for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			return theCenter.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Center for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Center theCenter = (Center)findAncestorWithClass(this, Center.class);
			theCenter.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Center for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for label tag ");
		}
	}
}

