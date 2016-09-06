package edu.uiowa.slis.VIVOISF.Sweetheart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SweetheartLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SweetheartLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SweetheartLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Sweetheart theSweetheart = (Sweetheart)findAncestorWithClass(this, Sweetheart.class);
			if (!theSweetheart.commitNeeded) {
				pageContext.getOut().print(theSweetheart.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Sweetheart for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sweetheart for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Sweetheart theSweetheart = (Sweetheart)findAncestorWithClass(this, Sweetheart.class);
			return theSweetheart.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Sweetheart for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sweetheart for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Sweetheart theSweetheart = (Sweetheart)findAncestorWithClass(this, Sweetheart.class);
			theSweetheart.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Sweetheart for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sweetheart for label tag ");
		}
	}
}

