package edu.uiowa.slis.VIVOISF.Foundation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FoundationAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FoundationAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(FoundationAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			if (!theFoundation.commitNeeded) {
				pageContext.getOut().print(theFoundation.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			return theFoundation.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Foundation for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Foundation theFoundation = (Foundation)findAncestorWithClass(this, Foundation.class);
			theFoundation.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Foundation for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Foundation for abbreviation tag ");
		}
	}
}

