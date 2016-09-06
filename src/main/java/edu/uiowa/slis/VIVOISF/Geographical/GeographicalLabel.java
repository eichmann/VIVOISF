package edu.uiowa.slis.VIVOISF.Geographical;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicalLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicalLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicalLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Geographical theGeographical = (Geographical)findAncestorWithClass(this, Geographical.class);
			if (!theGeographical.commitNeeded) {
				pageContext.getOut().print(theGeographical.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Geographical theGeographical = (Geographical)findAncestorWithClass(this, Geographical.class);
			return theGeographical.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Geographical for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Geographical theGeographical = (Geographical)findAncestorWithClass(this, Geographical.class);
			theGeographical.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Geographical for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Geographical for label tag ");
		}
	}
}

