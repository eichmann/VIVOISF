package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			if (!theEditorship.commitNeeded) {
				pageContext.getOut().print(theEditorship.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			return theEditorship.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Editorship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			theEditorship.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for label tag ");
		}
	}
}

