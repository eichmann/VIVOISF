package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(KindHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			if (!theKind.commitNeeded) {
				pageContext.getOut().print(theKind.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			return theKind.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Kind for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Kind theKind = (Kind)findAncestorWithClass(this, Kind.class);
			theKind.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for hideFromDisplay tag ");
		}
	}
}

