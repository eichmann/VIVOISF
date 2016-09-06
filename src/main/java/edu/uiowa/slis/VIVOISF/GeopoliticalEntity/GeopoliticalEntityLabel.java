package edu.uiowa.slis.VIVOISF.GeopoliticalEntity;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeopoliticalEntityLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeopoliticalEntityLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GeopoliticalEntityLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			if (!theGeopoliticalEntity.commitNeeded) {
				pageContext.getOut().print(theGeopoliticalEntity.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			return theGeopoliticalEntity.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeopoliticalEntity for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			GeopoliticalEntity theGeopoliticalEntity = (GeopoliticalEntity)findAncestorWithClass(this, GeopoliticalEntity.class);
			theGeopoliticalEntity.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing GeopoliticalEntity for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeopoliticalEntity for label tag ");
		}
	}
}

