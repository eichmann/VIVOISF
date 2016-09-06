package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			if (!theConsortium.commitNeeded) {
				pageContext.getOut().print(theConsortium.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			return theConsortium.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Consortium for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			theConsortium.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for label tag ");
		}
	}
}

