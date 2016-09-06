package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(KindLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			if (!theKind.commitNeeded) {
				pageContext.getOut().print(theKind.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			return theKind.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Kind for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			theKind.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for label tag ");
		}
	}
}

