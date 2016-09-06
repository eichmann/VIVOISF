package edu.uiowa.slis.VIVOISF.Muse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Muse theMuse = (Muse)findAncestorWithClass(this, Muse.class);
			if (!theMuse.commitNeeded) {
				pageContext.getOut().print(theMuse.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Muse for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Muse for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Muse theMuse = (Muse)findAncestorWithClass(this, Muse.class);
			return theMuse.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Muse for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Muse for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Muse theMuse = (Muse)findAncestorWithClass(this, Muse.class);
			theMuse.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Muse for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Muse for label tag ");
		}
	}
}

