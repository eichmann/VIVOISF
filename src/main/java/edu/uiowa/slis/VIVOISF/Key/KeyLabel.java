package edu.uiowa.slis.VIVOISF.Key;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeyLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KeyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(KeyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Key theKey = (Key)findAncestorWithClass(this, Key.class);
			if (!theKey.commitNeeded) {
				pageContext.getOut().print(theKey.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Key for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Key for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Key theKey = (Key)findAncestorWithClass(this, Key.class);
			return theKey.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Key for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Key for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Key theKey = (Key)findAncestorWithClass(this, Key.class);
			theKey.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Key for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Key for label tag ");
		}
	}
}

