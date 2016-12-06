package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280Abbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280Abbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280Abbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			UO_0000280 theUO_0000280 = (UO_0000280)findAncestorWithClass(this, UO_0000280.class);
			if (!theUO_0000280.commitNeeded) {
				pageContext.getOut().print(theUO_0000280.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			UO_0000280 theUO_0000280 = (UO_0000280)findAncestorWithClass(this, UO_0000280.class);
			return theUO_0000280.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing UO_0000280 for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			UO_0000280 theUO_0000280 = (UO_0000280)findAncestorWithClass(this, UO_0000280.class);
			theUO_0000280.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for abbreviation tag ");
		}
	}
}

