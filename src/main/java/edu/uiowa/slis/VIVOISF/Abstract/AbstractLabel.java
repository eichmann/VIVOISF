package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Abstract theAbstract = (Abstract)findAncestorWithClass(this, Abstract.class);
			if (!theAbstract.commitNeeded) {
				pageContext.getOut().print(theAbstract.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Abstract theAbstract = (Abstract)findAncestorWithClass(this, Abstract.class);
			return theAbstract.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Abstract for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Abstract theAbstract = (Abstract)findAncestorWithClass(this, Abstract.class);
			theAbstract.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for label tag ");
		}
	}
}

