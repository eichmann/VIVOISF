package edu.uiowa.slis.VIVOISF.F1000Link;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class F1000LinkLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static F1000LinkLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(F1000LinkLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			F1000Link theF1000Link = (F1000Link)findAncestorWithClass(this, F1000Link.class);
			if (!theF1000Link.commitNeeded) {
				pageContext.getOut().print(theF1000Link.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing F1000Link for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			F1000Link theF1000Link = (F1000Link)findAncestorWithClass(this, F1000Link.class);
			return theF1000Link.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing F1000Link for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			F1000Link theF1000Link = (F1000Link)findAncestorWithClass(this, F1000Link.class);
			theF1000Link.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing F1000Link for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for label tag ");
		}
	}
}

