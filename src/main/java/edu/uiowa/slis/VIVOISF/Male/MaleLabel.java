package edu.uiowa.slis.VIVOISF.Male;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MaleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MaleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MaleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Male theMale = (Male)findAncestorWithClass(this, Male.class);
			if (!theMale.commitNeeded) {
				pageContext.getOut().print(theMale.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Male for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Male for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Male theMale = (Male)findAncestorWithClass(this, Male.class);
			return theMale.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Male for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Male for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Male theMale = (Male)findAncestorWithClass(this, Male.class);
			theMale.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Male for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Male for label tag ");
		}
	}
}

