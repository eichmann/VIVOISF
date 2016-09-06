package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			if (!theMuseum.commitNeeded) {
				pageContext.getOut().print(theMuseum.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			return theMuseum.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Museum for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Museum theMuseum = (Museum)findAncestorWithClass(this, Museum.class);
			theMuseum.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for label tag ");
		}
	}
}

