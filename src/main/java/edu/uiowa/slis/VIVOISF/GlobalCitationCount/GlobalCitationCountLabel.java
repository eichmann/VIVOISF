package edu.uiowa.slis.VIVOISF.GlobalCitationCount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GlobalCitationCountLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GlobalCitationCountLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GlobalCitationCountLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GlobalCitationCount theGlobalCitationCount = (GlobalCitationCount)findAncestorWithClass(this, GlobalCitationCount.class);
			if (!theGlobalCitationCount.commitNeeded) {
				pageContext.getOut().print(theGlobalCitationCount.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			GlobalCitationCount theGlobalCitationCount = (GlobalCitationCount)findAncestorWithClass(this, GlobalCitationCount.class);
			return theGlobalCitationCount.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing GlobalCitationCount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			GlobalCitationCount theGlobalCitationCount = (GlobalCitationCount)findAncestorWithClass(this, GlobalCitationCount.class);
			theGlobalCitationCount.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing GlobalCitationCount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GlobalCitationCount for label tag ");
		}
	}
}

