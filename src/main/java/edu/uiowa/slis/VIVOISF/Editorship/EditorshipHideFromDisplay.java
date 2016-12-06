package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			if (!theEditorship.commitNeeded) {
				pageContext.getOut().print(theEditorship.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			return theEditorship.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Editorship for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			theEditorship.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for hideFromDisplay tag ");
		}
	}
}

