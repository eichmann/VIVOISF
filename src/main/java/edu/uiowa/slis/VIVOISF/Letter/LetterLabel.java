package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Letter theLetter = (Letter)findAncestorWithClass(this, Letter.class);
			if (!theLetter.commitNeeded) {
				pageContext.getOut().print(theLetter.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Letter theLetter = (Letter)findAncestorWithClass(this, Letter.class);
			return theLetter.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Letter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Letter theLetter = (Letter)findAncestorWithClass(this, Letter.class);
			theLetter.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for label tag ");
		}
	}
}

