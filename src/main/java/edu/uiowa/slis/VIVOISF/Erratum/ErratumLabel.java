package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Erratum theErratum = (Erratum)findAncestorWithClass(this, Erratum.class);
			if (!theErratum.commitNeeded) {
				pageContext.getOut().print(theErratum.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Erratum theErratum = (Erratum)findAncestorWithClass(this, Erratum.class);
			return theErratum.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Erratum for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Erratum theErratum = (Erratum)findAncestorWithClass(this, Erratum.class);
			theErratum.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for label tag ");
		}
	}
}

